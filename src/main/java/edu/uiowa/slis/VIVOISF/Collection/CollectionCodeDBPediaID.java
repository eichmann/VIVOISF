package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCodeDBPediaIDIterator theCollection = (CollectionCodeDBPediaIDIterator)findAncestorWithClass(this, CollectionCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theCollection.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

