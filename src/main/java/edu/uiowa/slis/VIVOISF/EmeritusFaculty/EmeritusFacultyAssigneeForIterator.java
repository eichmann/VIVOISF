package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class EmeritusFacultyAssigneeForIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyAssigneeForIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyAssigneeForIterator.class);

	String subjectURI = null;
	String type = null;
	String assigneeFor = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty) findAncestorWithClass(this, EmeritusFaculty.class);

			if (theEmeritusFaculty != null) {
				subjectURI = theEmeritusFaculty.getSubjectURI();
			}

			if (theEmeritusFaculty == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://vivoweb.org/ontology/core#assigneeFor> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				assigneeFor = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + assigneeFor + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in EmeritusFacultyAssigneeForIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in EmeritusFacultyAssigneeForIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				assigneeFor = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + assigneeFor + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in EmeritusFacultyAssigneeForIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in EmeritusFacultyAssigneeForIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in EmeritusFacultyAssigneeFor doEndTag", e);
			throw new JspTagException("Exception raised in EmeritusFacultyAssigneeFor doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setAssigneeFor(String assigneeFor) {
		this.assigneeFor = assigneeFor;
	}

	public String getAssigneeFor() {
		return assigneeFor;
	}

}
