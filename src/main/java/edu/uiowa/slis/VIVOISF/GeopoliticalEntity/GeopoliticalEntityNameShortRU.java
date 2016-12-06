package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameShortRUIterator theGeopoliticalEntity = (GeopoliticalEntityNameShortRUIterator)findAncestorWithClass(this, GeopoliticalEntityNameShortRUIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

