package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565HasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565HasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565HasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565HasSuccessorOrganizationIterator theERO_0000565HasSuccessorOrganizationIterator = (ERO_0000565HasSuccessorOrganizationIterator)findAncestorWithClass(this, ERO_0000565HasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theERO_0000565HasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

