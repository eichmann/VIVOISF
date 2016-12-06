package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameListESIterator theGeopoliticalEntity = (GeopoliticalEntityNameListESIterator)findAncestorWithClass(this, GeopoliticalEntityNameListESIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

