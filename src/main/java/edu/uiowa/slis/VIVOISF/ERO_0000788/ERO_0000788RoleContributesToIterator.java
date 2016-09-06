package edu.uiowa.slis.VIVOISF.ERO_0000788;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ERO_0000788RoleContributesToIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000788RoleContributesToIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000788RoleContributesToIterator.class);

	String subjectURI = null;
	String type = null;
	String roleContributesTo = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ERO_0000788 theERO_0000788 = (ERO_0000788) findAncestorWithClass(this, ERO_0000788.class);

			if (theERO_0000788 != null) {
				subjectURI = theERO_0000788.getSubjectURI();
			}

			if (theERO_0000788 == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://vivoweb.org/ontology/core#roleContributesTo> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				roleContributesTo = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + roleContributesTo + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ERO_0000788RoleContributesToIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ERO_0000788RoleContributesToIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				roleContributesTo = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + roleContributesTo + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ERO_0000788RoleContributesToIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ERO_0000788RoleContributesToIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ERO_0000788RoleContributesTo doEndTag", e);
			throw new JspTagException("Exception raised in ERO_0000788RoleContributesTo doEndTag");
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

	public void setRoleContributesTo(String roleContributesTo) {
		this.roleContributesTo = roleContributesTo;
	}

	public String getRoleContributesTo() {
		return roleContributesTo;
	}

}
