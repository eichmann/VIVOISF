package edu.uiowa.slis.VIVOISF.Geographical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicalHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicalHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicalHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicalHasURLIterator theGeographicalHasURLIterator = (GeographicalHasURLIterator)findAncestorWithClass(this, GeographicalHasURLIterator.class);
			pageContext.getOut().print(theGeographicalHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

