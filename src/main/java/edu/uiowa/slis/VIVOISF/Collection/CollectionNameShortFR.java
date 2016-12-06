package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameShortFRIterator theCollection = (CollectionNameShortFRIterator)findAncestorWithClass(this, CollectionNameShortFRIterator.class);
			pageContext.getOut().print(theCollection.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

