package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameCurrencyENIterator thespecial_group = (special_groupNameCurrencyENIterator)findAncestorWithClass(this, special_groupNameCurrencyENIterator.class);
			pageContext.getOut().print(thespecial_group.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

