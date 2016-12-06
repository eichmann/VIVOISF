package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNationalityITIterator theStateOrProvince = (StateOrProvinceNationalityITIterator)findAncestorWithClass(this, StateOrProvinceNationalityITIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

