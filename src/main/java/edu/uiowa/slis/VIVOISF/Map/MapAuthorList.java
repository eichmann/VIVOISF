package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(MapAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapAuthorListIterator theMapAuthorListIterator = (MapAuthorListIterator)findAncestorWithClass(this, MapAuthorListIterator.class);
			pageContext.getOut().print(theMapAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for authorList tag ");
		}
		return SKIP_BODY;
	}
}

