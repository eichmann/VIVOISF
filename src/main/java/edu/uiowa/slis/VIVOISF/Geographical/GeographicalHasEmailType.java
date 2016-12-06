package edu.uiowa.slis.VIVOISF.Geographical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicalHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicalHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicalHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicalHasEmailIterator theGeographicalHasEmailIterator = (GeographicalHasEmailIterator)findAncestorWithClass(this, GeographicalHasEmailIterator.class);
			pageContext.getOut().print(theGeographicalHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

