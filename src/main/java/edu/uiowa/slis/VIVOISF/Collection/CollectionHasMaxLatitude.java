package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionHasMaxLatitudeIterator theCollection = (CollectionHasMaxLatitudeIterator)findAncestorWithClass(this, CollectionHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theCollection.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

