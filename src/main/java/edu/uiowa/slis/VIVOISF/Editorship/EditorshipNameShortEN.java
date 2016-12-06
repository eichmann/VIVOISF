package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameShortENIterator theEditorship = (EditorshipNameShortENIterator)findAncestorWithClass(this, EditorshipNameShortENIterator.class);
			pageContext.getOut().print(theEditorship.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

