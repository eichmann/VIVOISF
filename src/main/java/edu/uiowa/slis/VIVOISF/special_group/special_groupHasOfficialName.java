package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasOfficialName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasOfficialName currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasOfficialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupHasOfficialNameIterator thespecial_group = (special_groupHasOfficialNameIterator)findAncestorWithClass(this, special_groupHasOfficialNameIterator.class);
			pageContext.getOut().print(thespecial_group.getHasOfficialName());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasOfficialName tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasOfficialName tag ");
		}
		return SKIP_BODY;
	}
}

