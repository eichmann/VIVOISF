package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameCurrencyENIterator theEditorship = (EditorshipNameCurrencyENIterator)findAncestorWithClass(this, EditorshipNameCurrencyENIterator.class);
			pageContext.getOut().print(theEditorship.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

