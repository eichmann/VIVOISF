package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameCurrencyZHIterator thegroup = (groupNameCurrencyZHIterator)findAncestorWithClass(this, groupNameCurrencyZHIterator.class);
			pageContext.getOut().print(thegroup.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

