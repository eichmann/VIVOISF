package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionHasMaxLongitudeIterator theCollection = (CollectionHasMaxLongitudeIterator)findAncestorWithClass(this, CollectionHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theCollection.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

