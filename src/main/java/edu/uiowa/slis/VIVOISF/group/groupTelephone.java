package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(groupTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupTelephoneIterator thegroup = (groupTelephoneIterator)findAncestorWithClass(this, groupTelephoneIterator.class);
			pageContext.getOut().print(thegroup.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing group for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for telephone tag ");
		}
		return SKIP_BODY;
	}
}

