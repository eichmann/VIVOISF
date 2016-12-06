package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameShortARIterator theGeopoliticalEntity = (GeopoliticalEntityNameShortARIterator)findAncestorWithClass(this, GeopoliticalEntityNameShortARIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

