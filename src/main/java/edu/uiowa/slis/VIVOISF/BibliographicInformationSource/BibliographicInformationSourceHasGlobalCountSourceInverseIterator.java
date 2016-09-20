package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class BibliographicInformationSourceHasGlobalCountSourceInverseIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceHasGlobalCountSourceInverseIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceHasGlobalCountSourceInverseIterator.class);

	String subjectURI = null;
	String type = null;
	String hasGlobalCountSourceInverse = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BibliographicInformationSource theBibliographicInformationSource = (BibliographicInformationSource) findAncestorWithClass(this, BibliographicInformationSource.class);

			if (theBibliographicInformationSource != null) {
				subjectURI = theBibliographicInformationSource.getSubjectURI();
			}

			if (theBibliographicInformationSource == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" ?s <http://purl.org/spar/c4o/hasGlobalCountSource> <" + subjectURI+ "> . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasGlobalCountSourceInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + hasGlobalCountSourceInverse + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in BibliographicInformationSourceHasGlobalCountSourceInverseIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BibliographicInformationSourceHasGlobalCountSourceInverseIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasGlobalCountSourceInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + hasGlobalCountSourceInverse + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in BibliographicInformationSourceHasGlobalCountSourceIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in BibliographicInformationSourceHasGlobalCountSourceIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in BibliographicInformationSourceHasGlobalCountSource doEndTag", e);
			throw new JspTagException("Exception raised in BibliographicInformationSourceHasGlobalCountSource doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		hasGlobalCountSourceInverse = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setHasGlobalCountSourceInverse(String hasGlobalCountSourceInverse) {
		this.hasGlobalCountSourceInverse = hasGlobalCountSourceInverse;
	}

	public String getHasGlobalCountSourceInverse() {
		return hasGlobalCountSourceInverse;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to BibliographicInformationSourceHasGlobalCountSourceIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
