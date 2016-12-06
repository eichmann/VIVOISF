package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameListITIterator theGeopoliticalEntity = (GeopoliticalEntityNameListITIterator)findAncestorWithClass(this, GeopoliticalEntityNameListITIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

