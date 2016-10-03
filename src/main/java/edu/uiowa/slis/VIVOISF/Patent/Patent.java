package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Patent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Patent currentInstance = null;
	private static final Log log = LogFactory.getLog(Patent.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String patentNumber = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PatentIterator thePatentIterator = (PatentIterator) findAncestorWithClass(this, PatentIterator.class);

			if (thePatentIterator != null) {
				subjectURI = thePatentIterator.getSubjectURI();
				label = thePatentIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Agent.AgentAssigneeForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Agent.AgentAssigneeForIterator)this.getParent()).getAssigneeFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateFiledInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateFiledInverseIterator)this.getParent()).getDateFiledInverse();
			}

			edu.uiowa.slis.VIVOISF.Agent.AgentAssigneeForIterator theAgentAssigneeForIterator = (edu.uiowa.slis.VIVOISF.Agent.AgentAssigneeForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Agent.AgentAssigneeForIterator.class);

			if (subjectURI == null && theAgentAssigneeForIterator != null) {
				subjectURI = theAgentAssigneeForIterator.getAssigneeFor();
			}

			if (thePatentIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?patentNumber ?patentNumber where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#patentNumber> ?patentNumber } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#patentNumber> ?patentNumber } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					patentNumber = sol.get("?patentNumber") == null ? null : sol.get("?patentNumber").toString();
					patentNumber = sol.get("?patentNumber") == null ? null : sol.get("?patentNumber").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Patent doStartTag", e);
			throw new JspTagException("Exception raised in Patent doStartTag");
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
			log.error("Exception raised in Patent doEndTag", e);
			throw new JspTagException("Exception raised in Patent doEndTag");
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

	public void setPatentNumber(String patentNumber) {
		this.patentNumber = patentNumber;
	}

	public String getPatentNumber() {
		return patentNumber;
	}

}
