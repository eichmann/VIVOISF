package edu.uiowa.slis.VIVOISF.Geographical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicalHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicalHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicalHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicalHasEmailIterator theGeographicalHasEmailIterator = (GeographicalHasEmailIterator)findAncestorWithClass(this, GeographicalHasEmailIterator.class);
			pageContext.getOut().print(theGeographicalHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

