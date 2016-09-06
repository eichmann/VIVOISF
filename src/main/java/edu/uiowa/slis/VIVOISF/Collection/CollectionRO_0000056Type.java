package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionRO_0000056Iterator theCollectionRO_0000056Iterator = (CollectionRO_0000056Iterator)findAncestorWithClass(this, CollectionRO_0000056Iterator.class);
			pageContext.getOut().print(theCollectionRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

