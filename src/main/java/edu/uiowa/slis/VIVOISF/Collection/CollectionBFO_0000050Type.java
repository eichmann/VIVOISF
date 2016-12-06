package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionBFO_0000050Iterator theCollectionBFO_0000050Iterator = (CollectionBFO_0000050Iterator)findAncestorWithClass(this, CollectionBFO_0000050Iterator.class);
			pageContext.getOut().print(theCollectionBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

