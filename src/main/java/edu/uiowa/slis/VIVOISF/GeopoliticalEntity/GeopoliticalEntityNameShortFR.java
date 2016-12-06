package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameShortFRIterator theGeopoliticalEntity = (GeopoliticalEntityNameShortFRIterator)findAncestorWithClass(this, GeopoliticalEntityNameShortFRIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

