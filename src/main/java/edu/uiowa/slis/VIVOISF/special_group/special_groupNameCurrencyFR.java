package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameCurrencyFRIterator thespecial_group = (special_groupNameCurrencyFRIterator)findAncestorWithClass(this, special_groupNameCurrencyFRIterator.class);
			pageContext.getOut().print(thespecial_group.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

