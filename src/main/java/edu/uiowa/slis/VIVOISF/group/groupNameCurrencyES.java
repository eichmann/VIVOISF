package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameCurrencyESIterator thegroup = (groupNameCurrencyESIterator)findAncestorWithClass(this, groupNameCurrencyESIterator.class);
			pageContext.getOut().print(thegroup.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

