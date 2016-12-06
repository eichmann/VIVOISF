package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameListRUIterator theGeopoliticalEntity = (GeopoliticalEntityNameListRUIterator)findAncestorWithClass(this, GeopoliticalEntityNameListRUIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

