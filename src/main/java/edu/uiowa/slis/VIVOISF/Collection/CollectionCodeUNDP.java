package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCodeUNDPIterator theCollection = (CollectionCodeUNDPIterator)findAncestorWithClass(this, CollectionCodeUNDPIterator.class);
			pageContext.getOut().print(theCollection.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

