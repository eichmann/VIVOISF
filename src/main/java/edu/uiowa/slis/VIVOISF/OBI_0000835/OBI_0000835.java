package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class OBI_0000835 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835 currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;
	String overview = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			OBI_0000835Iterator theOBI_0000835Iterator = (OBI_0000835Iterator) findAncestorWithClass(this, OBI_0000835Iterator.class);

			if (theOBI_0000835Iterator != null) {
				subjectURI = theOBI_0000835Iterator.getSubjectURI();
				label = theOBI_0000835Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000004.ERO_0000004ERO_0000034Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000004.ERO_0000004ERO_0000034Iterator)this.getParent()).getERO_0000034();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000006.ERO_0000006ERO_0000034Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000006.ERO_0000006ERO_0000034Iterator)this.getParent()).getERO_0000034();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000034Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000034Iterator)this.getParent()).getERO_0000034();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000034Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000034Iterator)this.getParent()).getERO_0000034();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000004.ERO_0000004ERO_0000034Iterator theERO_0000004ERO_0000034Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000004.ERO_0000004ERO_0000034Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000004.ERO_0000004ERO_0000034Iterator.class);

			if (subjectURI == null && theERO_0000004ERO_0000034Iterator != null) {
				subjectURI = theERO_0000004ERO_0000034Iterator.getERO_0000034();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000006.ERO_0000006ERO_0000034Iterator theERO_0000006ERO_0000034Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000006.ERO_0000006ERO_0000034Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000006.ERO_0000006ERO_0000034Iterator.class);

			if (subjectURI == null && theERO_0000006ERO_0000034Iterator != null) {
				subjectURI = theERO_0000006ERO_0000034Iterator.getERO_0000034();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000034Iterator theERO_0000071ERO_0000034Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000034Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000034Iterator.class);

			if (subjectURI == null && theERO_0000071ERO_0000034Iterator != null) {
				subjectURI = theERO_0000071ERO_0000034Iterator.getERO_0000034();
			}

			edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000034Iterator theERO_0001716ERO_0000034Iterator = (edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000034Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000034Iterator.class);

			if (subjectURI == null && theERO_0001716ERO_0000034Iterator != null) {
				subjectURI = theERO_0001716ERO_0000034Iterator.getERO_0000034();
			}

			if (theOBI_0000835Iterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  ?overview where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#overview> ?overview } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					overview = sol.get("?overview") == null ? null : sol.get("?overview").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in OBI_0000835 doStartTag", e);
			throw new JspTagException("Exception raised in OBI_0000835 doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in OBI_0000835 doEndTag", e);
			throw new JspTagException("Exception raised in OBI_0000835 doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getOverview() {
		return overview;
	}

}
