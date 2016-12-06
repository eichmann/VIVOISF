package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameCurrencyARIterator theStateOrProvince = (StateOrProvinceNameCurrencyARIterator)findAncestorWithClass(this, StateOrProvinceNameCurrencyARIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

