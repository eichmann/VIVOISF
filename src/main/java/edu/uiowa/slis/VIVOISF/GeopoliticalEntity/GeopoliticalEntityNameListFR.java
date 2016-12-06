package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameListFRIterator theGeopoliticalEntity = (GeopoliticalEntityNameListFRIterator)findAncestorWithClass(this, GeopoliticalEntityNameListFRIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

