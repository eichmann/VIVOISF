package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionTranslatorIterator theCollectionTranslatorIterator = (CollectionTranslatorIterator)findAncestorWithClass(this, CollectionTranslatorIterator.class);
			pageContext.getOut().print(theCollectionTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for translator tag ");
		}
		return SKIP_BODY;
	}
}

