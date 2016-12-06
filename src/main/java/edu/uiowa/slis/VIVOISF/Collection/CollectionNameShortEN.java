package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameShortENIterator theCollection = (CollectionNameShortENIterator)findAncestorWithClass(this, CollectionNameShortENIterator.class);
			pageContext.getOut().print(theCollection.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

