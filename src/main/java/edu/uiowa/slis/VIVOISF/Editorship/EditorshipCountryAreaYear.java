package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCountryAreaYearIterator theEditorship = (EditorshipCountryAreaYearIterator)findAncestorWithClass(this, EditorshipCountryAreaYearIterator.class);
			pageContext.getOut().print(theEditorship.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

