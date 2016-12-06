package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameListENIterator theEditorship = (EditorshipNameListENIterator)findAncestorWithClass(this, EditorshipNameListENIterator.class);
			pageContext.getOut().print(theEditorship.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

