package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameShortARIterator theCollection = (CollectionNameShortARIterator)findAncestorWithClass(this, CollectionNameShortARIterator.class);
			pageContext.getOut().print(theCollection.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

