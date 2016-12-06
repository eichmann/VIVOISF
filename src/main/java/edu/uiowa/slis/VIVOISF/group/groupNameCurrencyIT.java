package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameCurrencyITIterator thegroup = (groupNameCurrencyITIterator)findAncestorWithClass(this, groupNameCurrencyITIterator.class);
			pageContext.getOut().print(thegroup.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

