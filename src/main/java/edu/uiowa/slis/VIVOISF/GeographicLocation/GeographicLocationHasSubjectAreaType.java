package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasSubjectAreaIterator theGeographicLocationHasSubjectAreaIterator = (GeographicLocationHasSubjectAreaIterator)findAncestorWithClass(this, GeographicLocationHasSubjectAreaIterator.class);
			pageContext.getOut().print(theGeographicLocationHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

