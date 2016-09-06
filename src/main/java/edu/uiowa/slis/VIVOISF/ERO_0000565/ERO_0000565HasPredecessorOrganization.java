package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565HasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565HasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565HasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565HasPredecessorOrganizationIterator theERO_0000565HasPredecessorOrganizationIterator = (ERO_0000565HasPredecessorOrganizationIterator)findAncestorWithClass(this, ERO_0000565HasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theERO_0000565HasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

