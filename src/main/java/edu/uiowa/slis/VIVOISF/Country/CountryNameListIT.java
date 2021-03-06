package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameListITIterator theCountry = (CountryNameListITIterator)findAncestorWithClass(this, CountryNameListITIterator.class);
			pageContext.getOut().print(theCountry.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

