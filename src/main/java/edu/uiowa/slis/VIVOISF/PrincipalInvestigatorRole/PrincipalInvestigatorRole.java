package edu.uiowa.slis.VIVOISF.PrincipalInvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PrincipalInvestigatorRole extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrincipalInvestigatorRole currentInstance = null;
	private static final Log log = LogFactory.getLog(PrincipalInvestigatorRole.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;
	String hideFromDisplay = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PrincipalInvestigatorRoleIterator thePrincipalInvestigatorRoleIterator = (PrincipalInvestigatorRoleIterator) findAncestorWithClass(this, PrincipalInvestigatorRoleIterator.class);

			if (thePrincipalInvestigatorRoleIterator != null) {
				subjectURI = thePrincipalInvestigatorRoleIterator.getSubjectURI();
				label = thePrincipalInvestigatorRoleIterator.getLabel();
			}

			if (thePrincipalInvestigatorRoleIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?rdfValue  ?hideFromDisplay where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#hideFromDisplay> ?hideFromDisplay } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					hideFromDisplay = sol.get("?hideFromDisplay") == null ? null : sol.get("?hideFromDisplay").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in PrincipalInvestigatorRole doStartTag", e);
			throw new JspTagException("Exception raised in PrincipalInvestigatorRole doStartTag");
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
			log.error("Exception raised in PrincipalInvestigatorRole doEndTag", e);
			throw new JspTagException("Exception raised in PrincipalInvestigatorRole doEndTag");
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

	public void setHideFromDisplay(String hideFromDisplay) {
		this.hideFromDisplay = hideFromDisplay;
	}

	public String getHideFromDisplay() {
		return hideFromDisplay;
	}

}
