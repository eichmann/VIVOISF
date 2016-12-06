package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionGeographicFocusIterator theCollectionGeographicFocusIterator = (CollectionGeographicFocusIterator)findAncestorWithClass(this, CollectionGeographicFocusIterator.class);
			pageContext.getOut().print(theCollectionGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

