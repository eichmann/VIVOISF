package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Organization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Organization currentInstance = null;
	private static final Log log = LogFactory.getLog(Organization.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			OrganizationIterator theOrganizationIterator = (OrganizationIterator) findAncestorWithClass(this, OrganizationIterator.class);

			if (theOrganizationIterator != null) {
				subjectURI = theOrganizationIterator.getSubjectURI();
				label = theOrganizationIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Group.GroupHasMemberIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Group.GroupHasMemberIterator)this.getParent()).getHasMember();
			}

			edu.uiowa.slis.VIVOISF.Group.GroupHasMemberIterator theGroupHasMemberIterator = (edu.uiowa.slis.VIVOISF.Group.GroupHasMemberIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Group.GroupHasMemberIterator.class);

			if (subjectURI == null && theGroupHasMemberIterator != null) {
				subjectURI = theGroupHasMemberIterator.getHasMember();
			}

			if (theOrganizationIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Organization doStartTag", e);
			throw new JspTagException("Exception raised in Organization doStartTag");
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
			log.error("Exception raised in Organization doEndTag", e);
			throw new JspTagException("Exception raised in Organization doEndTag");
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

}
