package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameListARIterator theGeopoliticalEntity = (GeopoliticalEntityNameListARIterator)findAncestorWithClass(this, GeopoliticalEntityNameListARIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

