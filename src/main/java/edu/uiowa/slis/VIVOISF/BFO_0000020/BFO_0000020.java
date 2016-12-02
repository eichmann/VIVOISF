package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BFO_0000020 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String RO_0000052 = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BFO_0000020Iterator theBFO_0000020Iterator = (BFO_0000020Iterator) findAncestorWithClass(this, BFO_0000020Iterator.class);

			if (theBFO_0000020Iterator != null) {
				subjectURI = theBFO_0000020Iterator.getSubjectURI();
				label = theBFO_0000020Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0000053Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0000053Iterator)this.getParent()).getRO_0000053();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0000053Iterator theBFO_0000004RO_0000053Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0000053Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0000053Iterator.class);

			if (subjectURI == null && theBFO_0000004RO_0000053Iterator != null) {
				subjectURI = theBFO_0000004RO_0000053Iterator.getRO_0000053();
			}

			if (theBFO_0000020Iterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  ?RO_0000052 where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://purl.obolibrary.org/obo/RO_0000052> ?RO_0000052 } "
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
					RO_0000052 = sol.get("?RO_0000052") == null ? null : sol.get("?RO_0000052").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in BFO_0000020 doStartTag", e);
			throw new JspTagException("Exception raised in BFO_0000020 doStartTag");
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
			log.error("Exception raised in BFO_0000020 doEndTag", e);
			throw new JspTagException("Exception raised in BFO_0000020 doEndTag");
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

	public void setRO_0000052(String RO_0000052) {
		this.RO_0000052 = RO_0000052;
	}

	public String getRO_0000052() {
		return RO_0000052;
	}

}
