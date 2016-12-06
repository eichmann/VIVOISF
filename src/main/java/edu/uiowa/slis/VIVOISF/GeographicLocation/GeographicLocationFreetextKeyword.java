package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationFreetextKeywordIterator theGeographicLocation = (GeographicLocationFreetextKeywordIterator)findAncestorWithClass(this, GeographicLocationFreetextKeywordIterator.class);
			pageContext.getOut().print(theGeographicLocation.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

