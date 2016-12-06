package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameListZHIterator theGeopoliticalEntity = (GeopoliticalEntityNameListZHIterator)findAncestorWithClass(this, GeopoliticalEntityNameListZHIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

