package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameCurrencyENIterator thegroup = (groupNameCurrencyENIterator)findAncestorWithClass(this, groupNameCurrencyENIterator.class);
			pageContext.getOut().print(thegroup.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

