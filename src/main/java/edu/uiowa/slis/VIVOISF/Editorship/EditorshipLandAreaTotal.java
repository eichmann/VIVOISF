package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipLandAreaTotalIterator theEditorship = (EditorshipLandAreaTotalIterator)findAncestorWithClass(this, EditorshipLandAreaTotalIterator.class);
			pageContext.getOut().print(theEditorship.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

