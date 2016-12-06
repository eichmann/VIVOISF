package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameOfficialENIterator theEditorship = (EditorshipNameOfficialENIterator)findAncestorWithClass(this, EditorshipNameOfficialENIterator.class);
			pageContext.getOut().print(theEditorship.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

