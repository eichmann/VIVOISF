package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupTelephoneIterator thespecial_group = (special_groupTelephoneIterator)findAncestorWithClass(this, special_groupTelephoneIterator.class);
			pageContext.getOut().print(thespecial_group.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for telephone tag ");
		}
		return SKIP_BODY;
	}
}

