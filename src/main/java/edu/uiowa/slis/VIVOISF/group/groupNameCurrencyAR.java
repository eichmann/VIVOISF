package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameCurrencyARIterator thegroup = (groupNameCurrencyARIterator)findAncestorWithClass(this, groupNameCurrencyARIterator.class);
			pageContext.getOut().print(thegroup.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

