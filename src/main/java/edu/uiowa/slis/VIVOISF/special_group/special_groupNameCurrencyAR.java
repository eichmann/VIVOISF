package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameCurrencyARIterator thespecial_group = (special_groupNameCurrencyARIterator)findAncestorWithClass(this, special_groupNameCurrencyARIterator.class);
			pageContext.getOut().print(thespecial_group.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

