package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameCurrencyFRIterator theStateOrProvince = (StateOrProvinceNameCurrencyFRIterator)findAncestorWithClass(this, StateOrProvinceNameCurrencyFRIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

